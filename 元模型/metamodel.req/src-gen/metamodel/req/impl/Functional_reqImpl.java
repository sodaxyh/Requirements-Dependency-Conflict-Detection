/**
 */
package metamodel.req.impl;

import metamodel.req.Functional_req;
import metamodel.req.ReqPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metamodel.req.impl.Functional_reqImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link metamodel.req.impl.Functional_reqImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link metamodel.req.impl.Functional_reqImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link metamodel.req.impl.Functional_reqImpl#getInput <em>Input</em>}</li>
 *   <li>{@link metamodel.req.impl.Functional_reqImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link metamodel.req.impl.Functional_reqImpl#getRestriction <em>Restriction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Functional_reqImpl extends ReqImpl implements Functional_req {
	/**
	 * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected String event = EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgent() <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected String agent = AGENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected String operation = OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected String input = INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected String output = OUTPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestriction() <em>Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTRICTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected String restriction = RESTRICTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Functional_reqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.FUNCTIONAL_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(String newEvent) {
		String oldEvent = event;
		event = newEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.FUNCTIONAL_REQ__EVENT, oldEvent, event));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(String newAgent) {
		String oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.FUNCTIONAL_REQ__AGENT, oldAgent, agent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(String newOperation) {
		String oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.FUNCTIONAL_REQ__OPERATION, oldOperation,
					operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(String newInput) {
		String oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.FUNCTIONAL_REQ__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(String newOutput) {
		String oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.FUNCTIONAL_REQ__OUTPUT, oldOutput,
					output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction(String newRestriction) {
		String oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.FUNCTIONAL_REQ__RESTRICTION,
					oldRestriction, restriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ReqPackage.FUNCTIONAL_REQ__EVENT:
			return getEvent();
		case ReqPackage.FUNCTIONAL_REQ__AGENT:
			return getAgent();
		case ReqPackage.FUNCTIONAL_REQ__OPERATION:
			return getOperation();
		case ReqPackage.FUNCTIONAL_REQ__INPUT:
			return getInput();
		case ReqPackage.FUNCTIONAL_REQ__OUTPUT:
			return getOutput();
		case ReqPackage.FUNCTIONAL_REQ__RESTRICTION:
			return getRestriction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ReqPackage.FUNCTIONAL_REQ__EVENT:
			setEvent((String) newValue);
			return;
		case ReqPackage.FUNCTIONAL_REQ__AGENT:
			setAgent((String) newValue);
			return;
		case ReqPackage.FUNCTIONAL_REQ__OPERATION:
			setOperation((String) newValue);
			return;
		case ReqPackage.FUNCTIONAL_REQ__INPUT:
			setInput((String) newValue);
			return;
		case ReqPackage.FUNCTIONAL_REQ__OUTPUT:
			setOutput((String) newValue);
			return;
		case ReqPackage.FUNCTIONAL_REQ__RESTRICTION:
			setRestriction((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ReqPackage.FUNCTIONAL_REQ__EVENT:
			setEvent(EVENT_EDEFAULT);
			return;
		case ReqPackage.FUNCTIONAL_REQ__AGENT:
			setAgent(AGENT_EDEFAULT);
			return;
		case ReqPackage.FUNCTIONAL_REQ__OPERATION:
			setOperation(OPERATION_EDEFAULT);
			return;
		case ReqPackage.FUNCTIONAL_REQ__INPUT:
			setInput(INPUT_EDEFAULT);
			return;
		case ReqPackage.FUNCTIONAL_REQ__OUTPUT:
			setOutput(OUTPUT_EDEFAULT);
			return;
		case ReqPackage.FUNCTIONAL_REQ__RESTRICTION:
			setRestriction(RESTRICTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ReqPackage.FUNCTIONAL_REQ__EVENT:
			return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
		case ReqPackage.FUNCTIONAL_REQ__AGENT:
			return AGENT_EDEFAULT == null ? agent != null : !AGENT_EDEFAULT.equals(agent);
		case ReqPackage.FUNCTIONAL_REQ__OPERATION:
			return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
		case ReqPackage.FUNCTIONAL_REQ__INPUT:
			return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
		case ReqPackage.FUNCTIONAL_REQ__OUTPUT:
			return OUTPUT_EDEFAULT == null ? output != null : !OUTPUT_EDEFAULT.equals(output);
		case ReqPackage.FUNCTIONAL_REQ__RESTRICTION:
			return RESTRICTION_EDEFAULT == null ? restriction != null : !RESTRICTION_EDEFAULT.equals(restriction);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Event: ");
		result.append(event);
		result.append(", Agent: ");
		result.append(agent);
		result.append(", Operation: ");
		result.append(operation);
		result.append(", Input: ");
		result.append(input);
		result.append(", Output: ");
		result.append(output);
		result.append(", Restriction: ");
		result.append(restriction);
		result.append(')');
		return result.toString();
	}

} //Functional_reqImpl
