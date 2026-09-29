package OOP_practiseProblems;
class basicMembership
{
    String Name;
    String MembershipType;
    int Duration;
    basicMembership(String Name,String membershipType,int duration)
    {
        this.Name=Name;
        this.MembershipType=membershipType;
        this.Duration=duration;
    }
   double CalculateFee()
   {
       return this.Duration*50.0;
   }
   String SpecialOffer()
   {
       if(MembershipType.equalsIgnoreCase("annual")){
           return " 10% discount on annual Membership";
       }
       else return "No Discount Available";
   }
   void BasicMembershipDetails()
   {
       System.out.println("   Memeber Name: "+Name);
       System.out.println("Membership Type: "+MembershipType);
       System.out.println("       Duration: "+Duration+"months");
       System.out.println("Membership Fees: "+CalculateFee()+"taka");
       System.out.println(" Special Offers: "+SpecialOffer());
   }
}
class PremimumMembership extends basicMembership
{
    boolean Personal_trainer;
    boolean Spa_access;

    PremimumMembership(String Name,String MembershipType,int Duration,boolean trainer,boolean spa)
    {
        super(Name,MembershipType,Duration);
        this.Personal_trainer=trainer;
        this.Spa_access=spa;
    }
    double CalculateFee()
    {
        double tk=super.CalculateFee();
        int premiumFee=0;

        if(this.Personal_trainer==true)
        {
            premiumFee+=30*Duration;
        }
        if(this.Spa_access==true)
        {
            premiumFee+=20*Duration;
        }
       return tk+premiumFee;
    }
    String SpecialOffer()
    {
         return super.SpecialOffer();
    }
    void PrintPremiumMembership()
    {
        System.out.println("Premium Membership Details: ");
        super.BasicMembershipDetails();
        System.out.println("Personal Trainer: "+this.Personal_trainer);
        System.out.println("      Spa Access: "+this.Spa_access);
    }
}
public class GymMembership {
    public static void main(String[] args) {
        basicMembership p1=new basicMembership("Njeri Inka","Monthly",6);
        PremimumMembership p2=new PremimumMembership("Adel Mahamud Sayadi",
                "Annual",12,false,true);
        p1.BasicMembershipDetails();

        p2.PrintPremiumMembership();
    }
}
