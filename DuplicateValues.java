package week1.day2.assignment1;

public class DuplicateValues {

	public static void main(String[] args) {
		int[] my_array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);

                
                
	}

}
        
        }
	}
}


        