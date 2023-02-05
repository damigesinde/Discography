/*

  Name: Dami Gesinde
  Date: February 4, 2023
  Purpose of Program: This program was made during my second semester of junior year. Terrified about what major I'd decide on and petrified that I wouldn't succeed in it, I completed various major quizzes and multiple major randomizers, eventually, I decided to make my own randomizer. Ps. I gonna try out engineering. 

*/


import java.util.Arrays;
import java.util.Random;

class MajorRandomizer 
{
  public static void main(String[] args) 
  {

    // Introduction to the program
    System.out.println(" ");
    System.out.println("Welcome to your future. \nLet this major randomizer relieve the stress regarding what major you settle on and inform you on the potential money you will earn.");
    System.out.println(" ");
    System.out.println("Please note: not all average salarys will be accurate, do your research.");
    System.out.println(" ");
    

    // Creats an array to store the majors in
    String [] majors = new String[79];


    // Adds Arts and Humanities majors to the array
    majors [0] = "Ancient Greek Major, $74,200";
    majors [1] = "Arts and Entertainment Management Major, $104,900";
    majors [2] = "Creative Writing Major, $73,100";
    majors [3] = "Dance Major, $70,800";
    majors [4] = "Digital Arts Major, $67,400";
    majors [5] = "English Major, $51,000";
    majors [6] = "Fashion Design Major, $77,500";
    majors [7] = "Film Production Major, $68,000";
    majors [8] = "Film Studies Major, $58,200";
    majors [9] = "Industrial and Product Design Major, $63,400";
    majors [10] = "Graphic Design Major, $70,000";
    majors [11] = "Interior Architecture Major, $74,500";
    majors [12] = "Interior Design Major, $56,000";
    majors [13] = "Music Performance Major, $52,200";
    majors [14] = "Photography Major, $47,900";
    majors [15] = "Studio Arts Major, $47,200";
    majors [16] = "Theater Arts Major, $50,400";


    // Adds Business majors to the array
    majors [17] = "Accounting Major, $77,300";
    majors [18] = "Accounting Technology and Bookkeeping Major, $36,500";
    majors [19] = "Business Administration and Management Major, $60,500";
    majors [20] = "Business, General Major, $50,600";
    majors [21] = "Business and Managerial Economics Major, $72,400";
    majors [22] = "Economics Major, $71,900";
    majors [23] = "Entrepreneurial Studies Major, $110,000";
    majors [24] = "Fashion Merchandising Major, $64,000";
    majors [25] = "Finance Major, $108,600";
    majors [26] = "International Business Major, $85,100";
    majors [27] = "Marketing Major, $58,300";
    majors [28] = "Real Estate Major, $56,500";


    // Adds Health and Medicine majors to the array
    majors [29] = "Dental Hygiene Major, $95,500";
    majors [30] = "Health Sciences, General Major, $67,100";
    majors [31] = "Nursing (RN) Major, $73,300";
    majors [32] = "Pharmaceutical Sciences Major, $71,500";
    majors [33] = "Pre-Medicine Major, $43,000";


    // Adds Multi-Interdisciplinary Studies majors to the array
    majors [34] = "Exercise Science Major, $57,600";
    majors [35] = "General Studies Major, $45,900";
    majors [36] = "Sports and Fitness Administration Major, $49,900";


    // Adds Public and Social Service majors to the array
    majors [37] = "Legal Studies Major, $65,000";
    majors [38] = "Prelaw Studies Major, $75,000";
    majors [39] = "Public Health Major, $71,500";


    // Adds STEM majors to the array
    majors [41] = "Aerospace Engineering Major, $122,300";
    majors [42] = "Animal Sciences Major, $51,900";
    majors [43] = "Architecture Major, $64,700";
    majors [44] = "Architectural Engineering Major, $103,700";
    majors [45] = "Astronomy Major, $73,300";
    majors [46] = "Applied Mathematics Major, $76,300";
    majors [47] = "Biology Major, $72,400";
    majors [48] = "Biomedical Engineering Major, $97,400";
    majors [49] = "Chemistry Major, $60,800";
    majors [50] = "Chemical Engineering Major, $86,900";
    majors [51] = "Computer Software Engineering Major, $130,600";
    majors [52] = "Computer Science Major, $71,200";
    majors [53] = "Engineering, General Major, $84,100";
    majors [54] = "Environmental Engineering Major, $98,600";
    majors [55] = "Environmental Science Major, $49,700";
    majors [56] = "Health Sciences, General Major, $67,100";
    majors [57] = "Information Science Major, $73,400";
    majors [58] = "Marine Biology Major, $63,300";
    majors [59] = "Mathematics Major, $70,000";
    majors [60] = "Mechanical Engineering Major, $97,000";
    majors [61] = "Neuroscience Major, $128,600";
    majors [62] = "Physics Major, $62,200";
    majors [63] = "Public Health Major, $71,400";


    // Adds Social Science majors to the array
    majors [64] = "Animation and Special Effects Major, $78,800";
    majors [65] = "Anthropology Major, $61,900";
    majors [66] = "Criminology Major, $46,600";
    majors [67] = "Communication Sciences and Disorders Major, $58,200";
    majors [68] = "Counseling Psychology Major, $90,000";
    majors [69] = "Digital Communications and Multimedia Major, $59,500";
    majors [70] = "Education Major, $59,800";
    majors [71] = "History Major, $55,000";
    majors [72] = "Journalism  Major, $52,000";
    majors [73] = "Legal Studies Major, $56,000";
    majors [74] = "Liberal Arts and Sciences Major, $39,300";
    majors [75] = "Linguistics Major, $60,000";
    majors [76] = "Political Science and Government Major, $90,400";
    majors [77] = "Psychology Major, $102,000";
    majors [78] = "Social Work Major, $63,700";
    

    // Picks a random major and prints it
    int random = new Random().nextInt(majors.length);
    System.out.println(" ");
    System.out.println(majors[random]);
    System.out.println(" ");

    
  }
}