/**
 * 
 */
package sec.design_pattern.builder;

/**
 * @author sev_user
 *
 */
public class BuilderPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder meBuilder = new MealBuilder();
		
		Meal vegMeal = meBuilder.prepareVegMeal();
		System.out.println("Veg meal");
		vegMeal.showItems();
		System.out.println("Total cost : " + vegMeal.getCost());
		
		Meal nonVegMeal = meBuilder.prepareNonVegMeal();
		System.out.println("Non veg meal");
		nonVegMeal.showItems();
		System.out.println("Total cost : " + nonVegMeal.getCost());
	}

}
