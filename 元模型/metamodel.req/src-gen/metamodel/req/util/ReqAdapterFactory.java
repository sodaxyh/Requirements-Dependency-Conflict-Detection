/**
 */
package metamodel.req.util;

import metamodel.req.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see metamodel.req.ReqPackage
 * @generated
 */
public class ReqAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReqPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqSwitch<Adapter> modelSwitch = new ReqSwitch<Adapter>() {
		@Override
		public Adapter caseReq(Req object) {
			return createReqAdapter();
		}

		@Override
		public Adapter caseInterface_req(Interface_req object) {
			return createInterface_reqAdapter();
		}

		@Override
		public Adapter caseNonfunctional_req(Nonfunctional_req object) {
			return createNonfunctional_reqAdapter();
		}

		@Override
		public Adapter caseFunctional_req(Functional_req object) {
			return createFunctional_reqAdapter();
		}

		@Override
		public Adapter caseAssoc(Assoc object) {
			return createAssocAdapter();
		}

		@Override
		public Adapter caseSRS(SRS object) {
			return createSRSAdapter();
		}

		@Override
		public Adapter caseAbnormal(Abnormal object) {
			return createAbnormalAdapter();
		}

		@Override
		public Adapter caseNormal(Normal object) {
			return createNormalAdapter();
		}

		@Override
		public Adapter caseRealize(Realize object) {
			return createRealizeAdapter();
		}

		@Override
		public Adapter caseConstrain(Constrain object) {
			return createConstrainAdapter();
		}

		@Override
		public Adapter caseDepend(Depend object) {
			return createDependAdapter();
		}

		@Override
		public Adapter caseComposite(Composite object) {
			return createCompositeAdapter();
		}

		@Override
		public Adapter caseInteract(Interact object) {
			return createInteractAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseRestriction(Restriction object) {
			return createRestrictionAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseInput_output(Input_output object) {
			return createInput_outputAdapter();
		}

		@Override
		public Adapter casePerformance(Performance object) {
			return createPerformanceAdapter();
		}

		@Override
		public Adapter caseReliability(Reliability object) {
			return createReliabilityAdapter();
		}

		@Override
		public Adapter caseSecurity(Security object) {
			return createSecurityAdapter();
		}

		@Override
		public Adapter caseOperation_event(Operation_event object) {
			return createOperation_eventAdapter();
		}

		@Override
		public Adapter caseInconsistency(Inconsistency object) {
			return createInconsistencyAdapter();
		}

		@Override
		public Adapter caseInterlock(Interlock object) {
			return createInterlockAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Req <em>Req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Req
	 * @generated
	 */
	public Adapter createReqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Interface_req <em>Interface req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Interface_req
	 * @generated
	 */
	public Adapter createInterface_reqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Nonfunctional_req <em>Nonfunctional req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Nonfunctional_req
	 * @generated
	 */
	public Adapter createNonfunctional_reqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Functional_req <em>Functional req</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Functional_req
	 * @generated
	 */
	public Adapter createFunctional_reqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Assoc <em>Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Assoc
	 * @generated
	 */
	public Adapter createAssocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.SRS <em>SRS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.SRS
	 * @generated
	 */
	public Adapter createSRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Abnormal <em>Abnormal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Abnormal
	 * @generated
	 */
	public Adapter createAbnormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Normal <em>Normal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Normal
	 * @generated
	 */
	public Adapter createNormalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Realize <em>Realize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Realize
	 * @generated
	 */
	public Adapter createRealizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Constrain <em>Constrain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Constrain
	 * @generated
	 */
	public Adapter createConstrainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Depend <em>Depend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Depend
	 * @generated
	 */
	public Adapter createDependAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Composite
	 * @generated
	 */
	public Adapter createCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Interact <em>Interact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Interact
	 * @generated
	 */
	public Adapter createInteractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Restriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Restriction
	 * @generated
	 */
	public Adapter createRestrictionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Input_output <em>Input output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Input_output
	 * @generated
	 */
	public Adapter createInput_outputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Performance
	 * @generated
	 */
	public Adapter createPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Reliability
	 * @generated
	 */
	public Adapter createReliabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Security
	 * @generated
	 */
	public Adapter createSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Operation_event <em>Operation event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Operation_event
	 * @generated
	 */
	public Adapter createOperation_eventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Inconsistency <em>Inconsistency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Inconsistency
	 * @generated
	 */
	public Adapter createInconsistencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link metamodel.req.Interlock <em>Interlock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see metamodel.req.Interlock
	 * @generated
	 */
	public Adapter createInterlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReqAdapterFactory
