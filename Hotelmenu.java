import java.util.Scanner;

public class Hotelmenu {
    public static void main(String[] args) {
        boolean t = true;
        int bill = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Hotel");
        while (t) {
            System.out.println("Choose what would you like\n1.Starter\n2.Vegetarian\n3.Non-Vegetarian\n4.Desert\n5.Get Bill\n");
            System.out.print("Enter your choice:");
            int input = sc.nextInt();
            if (input == 1) {
                boolean star = true;
                while(star){
                System.out.println("1.cocktail samosa -- 60\n2.Batata vada -- 80\n3.Pani puri -- 40\n4.Tomato soup -- 60\n5.dill Pakoda -- 100\n6.Back\n");
                System.out.print("Enter your choice:");
                Scanner sm = new Scanner(System.in);
                int starmenu = sm.nextInt();
                switch (starmenu) {
                    case 1:
                    System.out.println("Enter number of plates you want?");
                    int cs= sm.nextInt();
                    bill = bill+(60*cs);
                    break;
                    case 2:
                    System.out.println("Enter number of plates you want?");
                    int bv = sm.nextInt();
                    bill = bill+(80*bv);
                    break;
                    case 3:
                    System.out.println("Enter number of plates you want?");
                    int pp= sm.nextInt();
                    bill = bill+(40*pp);
                    break;
                    case 4:
                    System.out.println("Enter number of plates you want?");
                    int ts = sm.nextInt();
                    bill = bill+(60*ts);
                    break;
                    case 5:
                    System.out.println("Enter number of plates you want?");
                    int dp = sm.nextInt();
                    bill = bill+(100*dp);
                    break; 
                    case 6:
                       star = false;  
                }
                }
            }
            else if (input == 2) {
                boolean veg = true;
                while(veg){
                System.out.println("1.Veg. Pulao -- 160\n2.Plain Raita-- 102\n3.Steam Rice -- 140\n4.Shahi Paneer -- 280\n5.Veg Chopsouey -- 195\n6.Back\n");
                System.out.print("Enter your choice:");
                Scanner vm = new Scanner(System.in);
                int vegmenu = vm.nextInt();
                switch (vegmenu) {
                    case 1:
                    System.out.println("Enter number of plates you want?");
                    int vp= vm.nextInt();
                    bill = bill+(160*vp);
                    break;
                    case 2:
                    System.out.println("Enter number of plates you want?");
                    int pr = vm.nextInt();
                    bill = bill+(102*pr);
                    break;
                    case 3:
                    System.out.println("Enter number of plates you want?");
                    int sr= vm.nextInt();
                    bill = bill+(140*sr);
                    break;
                    case 4:
                    System.out.println("Enter number of plates you want?");
                    int sp = vm.nextInt();
                    bill = bill+(280*sp);
                    break;
                    case 5:
                    System.out.println("Enter number of plates you want?");
                    int vc = vm.nextInt();
                    bill = bill+(195*vc);
                    break; 
                    case 6:
                       veg = false;  
                }
                }
            }
            else if (input == 3) {
                boolean nonveg = true;
                while(nonveg){
                System.out.println("1.Chicken curry -- 290\n2.Afghani chicken-- 220\n3.Egg bhurji -- 90\n4.Wings Fry -- 170\n5.mutton curry -- 300\n6.Back\n");
                System.out.print("Enter your choice:");
                Scanner nvm = new Scanner(System.in);
                int nonvegmenu = nvm.nextInt();
                switch (nonvegmenu) {
                    case 1:
                    System.out.println("Enter number of plates you want?");
                    int cc= nvm.nextInt();
                    bill = bill+(290*cc);
                    break;
                    case 2:
                    System.out.println("Enter number of plates you want?");
                    int ac = nvm.nextInt();
                    bill = bill+(220*ac);
                    break;
                    case 3:
                    System.out.println("Enter number of plates you want?");
                    int eb= nvm.nextInt();
                    bill = bill+(90*eb);
                    break;
                    case 4:
                    System.out.println("Enter number of plates you want?");
                    int wf = nvm.nextInt();
                    bill = bill+(170*wf);
                    break;
                    case 5:
                    System.out.println("Enter number of plates you want?");
                    int mc = nvm.nextInt();
                    bill = bill+(300*mc);
                    break; 
                    case 6:
                       nonveg = false;  
                }
                }
            }
            else if (input == 4) {
                boolean desert = true;
                while(desert){
                System.out.println("1.Kaju Kishmish -- 60\n2.Tutti Fruti -- 40\n3.Butter Scotch -- 50\n4.Black Currant -- 80\n5.Anjeer Honey -- 75\n6.Back\n");
                System.out.print("Enter your choice:");
                Scanner dm = new Scanner(System.in);
                int desmenu = dm.nextInt();
                switch (desmenu) {
                    case 1:
                    System.out.println("Enter number of plates you want?");
                    int kk= dm.nextInt();
                    bill = bill+(60*kk);
                    break;
                    case 2:
                    System.out.println("Enter number of plates you want?");
                    int tf = dm.nextInt();
                    bill = bill+(40*tf);
                    break;
                    case 3:
                    System.out.println("Enter number of plates you want?");
                    int bc= dm.nextInt();
                    bill = bill+(50*bc);
                    break;
                    case 4:
                    System.out.println("Enter number of plates you want?");
                    int bk = dm.nextInt();
                    bill = bill+(80*bk);
                    break;
                    case 5:
                    System.out.println("Enter number of plates you want?");
                    int ah = dm.nextInt();
                    bill = bill+(75*ah);
                    break; 
                    case 6:
                       desert = false;  
                }
                }
            }
            else if(input==5)
            {
                System.out.println("\nyour Total bill is "+bill);
                System.out.println("\nThank you visit again...");
                t = false;

            }
        
        }
    }
}