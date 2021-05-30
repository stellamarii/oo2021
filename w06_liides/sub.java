public class sub implements calculator{
	Integer subNr;
	public sub(Integer subNr){
		this.subNr=subNr;
	}
	public String calculate(Integer number){
        Integer answer = subNr - number;
		return subNr + " - " + number + " = " + answer;
	}
}