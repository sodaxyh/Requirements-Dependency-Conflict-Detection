/**
 */
package metamodel.req.util;

import metamodel.req.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see metamodel.req.ReqPackage
 * @generated
 */
public class ReqSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqSwitch() {
		if (modelPackage == null) {
			modelPackage = ReqPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ReqPackage.REQ: {
			Req req = (Req) theEObject;
			T result = caseReq(req);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.INTERFACE_REQ: {
			Interface_req interface_req = (Interface_req) theEObject;
			T result = caseInterface_req(interface_req);
			if (result == null)
				result = caseReq(interface_req);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.NONFUNCTIONAL_REQ: {
			Nonfunctional_req nonfunctional_req = (Nonfunctional_req) theEObject;
			T result = caseNonfunctional_req(nonfunctional_req);
			if (result == null)
				result = caseReq(nonfunctional_req);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.FUNCTIONAL_REQ: {
			Functional_req functional_req = (Functional_req) theEObject;
			T result = caseFunctional_req(functional_req);
			if (result == null)
				result = caseReq(functional_req);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.ASSOC: {
			Assoc assoc = (Assoc) theEObject;
			T result = caseAssoc(assoc);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.SRS: {
			SRS srs = (SRS) theEObject;
			T result = caseSRS(srs);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.ABNORMAL: {
			Abnormal abnormal = (Abnormal) theEObject;
			T result = caseAbnormal(abnormal);
			if (result == null)
				result = caseAssoc(abnormal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.NORMAL: {
			Normal normal = (Normal) theEObject;
			T result = caseNormal(normal);
			if (result == null)
				result = caseAssoc(normal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.REALIZE: {
			Realize realize = (Realize) theEObject;
			T result = caseRealize(realize);
			if (result == null)
				result = caseNormal(realize);
			if (result == null)
				result = caseAssoc(realize);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.CONSTRAIN: {
			Constrain constrain = (Constrain) theEObject;
			T result = caseConstrain(constrain);
			if (result == null)
				result = caseNormal(constrain);
			if (result == null)
				result = caseAssoc(constrain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.DEPEND: {
			Depend depend = (Depend) theEObject;
			T result = caseDepend(depend);
			if (result == null)
				result = caseNormal(depend);
			if (result == null)
				result = caseAssoc(depend);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.COMPOSITE: {
			Composite composite = (Composite) theEObject;
			T result = caseComposite(composite);
			if (result == null)
				result = caseNormal(composite);
			if (result == null)
				result = caseAssoc(composite);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.INTERACT: {
			Interact interact = (Interact) theEObject;
			T result = caseInteract(interact);
			if (result == null)
				result = caseNormal(interact);
			if (result == null)
				result = caseAssoc(interact);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.OPERATION: {
			Operation operation = (Operation) theEObject;
			T result = caseOperation(operation);
			if (result == null)
				result = caseInconsistency(operation);
			if (result == null)
				result = caseAbnormal(operation);
			if (result == null)
				result = caseAssoc(operation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.RESTRICTION: {
			Restriction restriction = (Restriction) theEObject;
			T result = caseRestriction(restriction);
			if (result == null)
				result = caseInconsistency(restriction);
			if (result == null)
				result = caseAbnormal(restriction);
			if (result == null)
				result = caseAssoc(restriction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseInconsistency(event);
			if (result == null)
				result = caseAbnormal(event);
			if (result == null)
				result = caseAssoc(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.INPUT_OUTPUT: {
			Input_output input_output = (Input_output) theEObject;
			T result = caseInput_output(input_output);
			if (result == null)
				result = caseInterlock(input_output);
			if (result == null)
				result = caseAbnormal(input_output);
			if (result == null)
				result = caseAssoc(input_output);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.PERFORMANCE: {
			Performance performance = (Performance) theEObject;
			T result = casePerformance(performance);
			if (result == null)
				result = caseNonfunctional_req(performance);
			if (result == null)
				result = caseReq(performance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.RELIABILITY: {
			Reliability reliability = (Reliability) theEObject;
			T result = caseReliability(reliability);
			if (result == null)
				result = caseNonfunctional_req(reliability);
			if (result == null)
				result = caseReq(reliability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.SECURITY: {
			Security security = (Security) theEObject;
			T result = caseSecurity(security);
			if (result == null)
				result = caseNonfunctional_req(security);
			if (result == null)
				result = caseReq(security);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.OPERATION_EVENT: {
			Operation_event operation_event = (Operation_event) theEObject;
			T result = caseOperation_event(operation_event);
			if (result == null)
				result = caseInterlock(operation_event);
			if (result == null)
				result = caseAbnormal(operation_event);
			if (result == null)
				result = caseAssoc(operation_event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.INCONSISTENCY: {
			Inconsistency inconsistency = (Inconsistency) theEObject;
			T result = caseInconsistency(inconsistency);
			if (result == null)
				result = caseAbnormal(inconsistency);
			if (result == null)
				result = caseAssoc(inconsistency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ReqPackage.INTERLOCK: {
			Interlock interlock = (Interlock) theEObject;
			T result = caseInterlock(interlock);
			if (result == null)
				result = caseAbnormal(interlock);
			if (result == null)
				result = caseAssoc(interlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReq(Req object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface_req(Interface_req object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nonfunctional req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nonfunctional req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonfunctional_req(Nonfunctional_req object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional req</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional req</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctional_req(Functional_req object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assoc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assoc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssoc(Assoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SRS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SRS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSRS(SRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abnormal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abnormal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbnormal(Abnormal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormal(Normal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealize(Realize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrain(Constrain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepend(Depend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteract(Interact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Restriction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestriction(Restriction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput_output(Input_output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformance(Performance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliability(Reliability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation_event(Operation_event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inconsistency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inconsistency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInconsistency(Inconsistency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interlock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interlock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterlock(Interlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ReqSwitch
