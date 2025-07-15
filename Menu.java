import java.util.Scanner;
public class Menu{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);

 String prompt = """

  Welcome to Nokia life

  1->Phone book -
  2->Messages-
  3->Chat
  4->Call register
  5->Tones
  7->Call divert
  8->Games
  9->Calculator
  10->Reminders
  11->Clock
  12->Profile
  13->Sim services

  """;
    System.out.print(prompt);
    System.out.println("Enter an options");
    int fellow = scan.nextInt();
    switch(fellow){
 case 1 : 
                    System.out.println(
                    """
                    1->search
                    2->Service Nos
                    3->Add name
                    4->Erase
                    5->Edit
                    6->Assign tone
                    7->Send b'card
                    8->Option
                    9->Speed dials
                    10->Voice tags""");
                                     
                      System.out.println("Enter to pick an options");
                      int input2 = scan.nextInt();
                      switch (input2){
      case 1 :  System.out.println("Searching");
                break;
      case 8 :  System.out.println("""
                1-> Type of view
                2-> memory status

		""");break;
			
}
                        
                System.out.println("Enter to pick an options");
                int output = scan.nextInt();
                switch (output){
         case 1:
              System.out.println("1-> Type of view");
}  
break;
case 2 : 
                    System.out.println("""
 
                    1-> Write message
                    2-> Inbox
                    3-> Outbox
                    4-> Picture messages
                    5-> Templates
                    6-> Smilets
                    7-> Message setting
                    8-> Info service
                    9-> Voice mailbox number
                    10-> service command editor""");

                    System.out.println("click an options");
                    int input5 = scan.nextInt();
                    switch (input5){
          case 7 :  
                    System.out.print("""
                    1-> Set 1
	            2-> Common 
                                   		""");
                      System.out.println("pick an options 1 or 2");
                      int input8 = scan.nextInt();
                  switch (input8){    
                      case 1:  
                       System.out.print("""
                                   1-> Message centre number
                                   2-> Message sent as
                                   3-> Message validity
""");	break;

                       case 2:  
                       System.out.print("""
                                   1-> Delivery reports
                                   2-> reply via same centre
                                   3-> Character suporrt
""");	
}
};	
break;		
	
	 case 3 : 
                    System.out.println("""
		
                                  1-> Chat

""");                 
        
                        
break;

                       
                      case 4:  
                       System.out.print("""
                             1-> Missed calls
                             2-> Received calls
                             3-> Dialled call
                             4-> Erase recent calls
                             5-> Show call duration
                             6-> Show call cost
                             7-> call cost setting 
                             8-> Prepaid credit

""");

                     System.out.println("pick an options");
                      int input9 = scan.nextInt();
                      switch (input9){
                      case 5 :  
                     System.out.print("""
                                   1-> Last call duration
                                   2-> All calls duration
                                   3-> Received calls duration
                                   4-> Dialled calls duration
                                   5-> Clear timers                            

""");
break;
           
                              
                      case 6 :  
                     System.out.print("""
                                   1-> Last call cost
                                   2-> All calls cost
                                   3-> Clear counters
""");break;


                       


                      case 7 :  
                     System.out.print("""
                                    1-> Call cost limit
                                    2-> Show cost in 
""");
}
break;


                     case 5 : 
                    System.out.print("""
                                  1: Ringing tone
                                  2: Ringing volume
                                  3: Incomiing alart
                                  4: Composer
                                  5: Message alart tone
                                  6: Keypad tones
                                  7: Warning and game tone
                                  8: Vibrating alart
""");
  break;
                
                              case 6:
          System.out.print("""

                                 1-> Call settings
                                 2-> Phone setting
                                 3-> Security setting 
                                 4-> Restore factory setting

""");
       

                           System.out.print("Enter option");
                     int input13 = scan.nextInt();
                        switch (input13){

                               case 1:
                    System.out.print("""  
                        1-> Automatic redail
                        2-> Speed dialing
                        3-> Call waiting option
                        4-> Own number sending
                        5-> Phone line in use
                        6-> Automatic answer
""");
break;

                              case 2:
                    System.out.print("""
                        1-> Language 
                        2-> Cell info display
                        3-> Welcome note
                        4-> Network selection
                        5-> Light
                        6-> Confirm SIM service action
""");

break;


                                        case 3:
                    System.out.print("""
                        1-> PIN code request
                        2-> Call barring service
                        3-> Fixed dialling
                        4-> Closed user group
                        5-> Phone security
                        6-> Change access codes 
""");
break;


                                case 4:
                   System.out.print("""
                        1-> Restore factory setting
""");
}
break;

                               case 7:
                   System.out.print("""
                        1-> Call divert
""");
break;


                             
                                case 8:
                   System.out.print("""
                        1-> Games
""");
break;


                               
                                case 9:
                   System.out.print("""
                        1-> Calculator
""");break;

   
                              
                                case 10:
                   System.out.print("""
                        1-> Reminders
""");break;

                               
                               case 11:
                   System.out.print("""
                        1-> Alarm Clock
                        2-> Clock setting
                        3-> Date setting 
                        4-> Stopwatch
                        5-> Countdown timer
                        6-> auto update of date time
""");break;


                               
                              case 12:
                  System.out.print("""
                        1-> Profile
""");break;                     
                   

                              
                             case 13:
                 System.out.print("""
                        1-> SIM services

""");break;

default: System.out.print("invalid input");
};


};

}





