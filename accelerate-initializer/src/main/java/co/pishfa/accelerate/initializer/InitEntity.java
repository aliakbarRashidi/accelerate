/**
 * 
 */
package co.pishfa.accelerate.initializer;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Configures the annotated type for initialization process to be used in {@link Initializer}.
 * 
 * @author Taha Ghasemi
 * 
 */
@Target({ ElementType.TYPE })
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InitEntity {

	/**
	 * @return additional properties for this entity. Can be used to override properties of parent or properties without
	 *         a field
	 */
	public InitProperty[] value() default {};

	/**
	 * 
	 * @return the name of property or comma separated name of properties whose value(s) specify a unique instance of
	 *         this entity. Can be *.
	 */
	public String unique() default "";

}
