package simulation;

public interface Athlete {

	String getName();
	
	void setName(String playerName);
	
	int[] getPosition();
	
	void setPostition(int[] position);
	
	int getOffenseRating();
	
	void setOffenseRating(int offense);
	
	int getDefenseRating();
	
	void setDefenseRating(int defense);
	
	int getOverall();
	
	double getContractAmount();
	
	void setContractAmount(double contactAmount);
	
	int getContractYears();
	
	void setContractYears(int contractYears);
	
	int getAge();
	
	void setAge(int age);
	
}
