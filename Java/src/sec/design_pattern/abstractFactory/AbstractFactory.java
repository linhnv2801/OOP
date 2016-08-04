/**
 * 
 */
package sec.design_pattern.abstractFactory;

/**
 * @author sev_user
 *
 */
public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
