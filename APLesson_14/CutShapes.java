public interface CutShapes
//methods in an interface aren't allowed to have bodies
//classes that implement the inteface MUST OVERRIDE ALL METHODS IN INTERFACE
{
	double pi=Math.PI; //instance variable in instances are public, final, need initalization
	public abstract double getArea();
}