public class sum implements calculator{
	Integer sumNr;
	public sum(Integer sumNr){
		this.sumNr=sumNr;
	}
	public String calculate(Integer number){
        Integer answer = sumNr + number;
		return sumNr+ " + " + number + " = " + answer;
	}
}