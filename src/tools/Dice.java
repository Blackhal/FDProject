package tools;

public class Dice {
	private int faces;
	private int[] faceData;
	
	public Dice(int faces, int[] faceData)
	{
		this.faces = faces;
		this.faceData = faceData;
	}
	
	public int getResult()
	{
		int r = (int)(Math.random()*faces);
		return faceData[r];
	}
}
