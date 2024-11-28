class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
    public class prac3 {
        public static void main(String[] args) {
            try{
                int age=2;
                if (age<20) {
                    throw new CustomException(" Age cant -ve ");
                
            }
            System.out.println("Age "+age);
        }
        catch(CustomException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
