public class Week3 {
	public static void main(String[] args) {
		String message = "", currentMonth = "February";
		boolean isTomatoAVegetable = false, isValentinesDay = true;
		if (!currentMonth.equals("February")) { // false
			message = message + "456268";
		} else {
			message = message + "486170";
		}
		if (true && (false || (12-6/2*3 > 2 && 0 == 0))) { // true
			message = message + "707920";
		} else {
			message = message + "737220";
		}
		if ((7+7/7*7-7 == 0) || (1952 % 3 == 0)) { // false
			message = message + "576E6B";
		} else {
			message = message + "56616C";
		}
		if (isTomatoAVegetable == !true && !isTomatoAVegetable == true) { // true
			message = message + "656E74";
		} else {
			message = message + "6B6E7A";
		}
		if (!true || true && !false || !true && !false) { // true
			message = message + "696E65";
		} else {
			message = message + "656F61";
		}
		if (!isValentinesDay) { // false
			message = message + "26633F";
		} else {
			message = message + "277321";
		}
		System.out.print(message);//48617070792056616C656E74696E65277321
	}
}
