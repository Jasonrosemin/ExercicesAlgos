
public class ExerciceBoucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] months = {"Janvier","Fevrier","Mars","Avril","Mai","Juin","Juillet","Août","Septempbre","Octobre","Novembre","Decembre"};
		
		for(int i = 0; i < months.length;i++) {
				
			for(int day = 1; day <= 31; day++) {
			
				System.out.println(months[i] + "    " + day);
			}
		}
	}
}
