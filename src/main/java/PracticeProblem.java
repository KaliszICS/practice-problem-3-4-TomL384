/**
 * File Name: Nested if
 * Author: Tom Leung
 * Date Created: March 29, 2026
 * Date Last Edited: March 29, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}
    public static int min (int v1, int v2, int v3){
		if (v2 < v3 & v2 < v1 ){
			v1 = v2  ;
		}
		else if (v3 < v2 & v3 < v1 ){
			v1 = v3  ;
		}
		return v1 ;
	}

	public static boolean isLeapYear(int v1){
		if (v1 %4 == 0){
			if (v1 %100 == 0){
				if (v1%400 == 0){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
	}
}
