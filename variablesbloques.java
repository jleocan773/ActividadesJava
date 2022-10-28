public class variablesbloques {
    int x;
    int y;
    int z;
    
        public static void main (String[]args){
            int x = 5;
            int y = 4;
    
            {
                int z = 6;
                
                System.out.println(x);
                System.out.println(y);  
                {
                    System.out.println(z);
                    System.out.println(x);
                    System.out.println(y);
                }
            }
        }
    
        
    }