/**
 * 
 */
package co.pishfa.accelerate.core;

import co.pishfa.accelerate.common.AuditableEvent;
import co.pishfa.security.Audited;

/**
 * @author Taha Ghasemi
 * 
 */
public class FrameworkStartedEvent implements AuditableEvent {

	@Override
	@Audited(action = "framework.started")
	public void audit() {
	}
}
