package midternexam.lab.lab6.bai1;

public class Customer {
   private String name;
   private boolean member;
   private String memberType;

   public Customer(String name) {
      this.name = name;
      this.member = false;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public boolean isMember() {
      return this.member;
   }

   public void setMember(boolean member) {
      this.member = member;
   }

   public String getMemberType() {
      return this.memberType;
   }

   public void setMemberType(String memberType) {
      this.memberType = memberType;
   }

   @Override
   public String toString() {
      return "[" + " name = " + getName() + ", member = " + isMember() + ", memberType = " + getMemberType()
            + "]";
   }

}
