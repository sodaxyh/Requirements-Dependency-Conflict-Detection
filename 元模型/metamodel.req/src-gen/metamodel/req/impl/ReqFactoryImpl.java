/**
 */
package metamodel.req.impl;

import metamodel.req.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqFactoryImpl extends EFactoryImpl implements ReqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReqFactory init() {
		try {
			ReqFactory theReqFactory = (ReqFactory) EPackage.Registry.INSTANCE.getEFactory(ReqPackage.eNS_URI);
			if (theReqFactory != null) {
				return theReqFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ReqPackage.INTERFACE_REQ:
			return createInterface_req();
		case ReqPackage.FUNCTIONAL_REQ:
			return createFunctional_req();
		case ReqPackage.SRS:
			return createSRS();
		case ReqPackage.REALIZE:
			return createRealize();
		case ReqPackage.CONSTRAIN:
			return createConstrain();
		case ReqPackage.DEPEND:
			return createDepend();
		case ReqPackage.COMPOSITE:
			return createComposite();
		case ReqPackage.INTERACT:
			return createInteract();
		case ReqPackage.OPERATION:
			return createOperation();
		case ReqPackage.RESTRICTION:
			return createRestriction();
		case ReqPackage.EVENT:
			return createEvent();
		case ReqPackage.INPUT_OUTPUT:
			return createInput_output();
		case ReqPackage.PERFORMANCE:
			return createPerformance();
		case ReqPackage.RELIABILITY:
			return createReliability();
		case ReqPackage.SECURITY:
			return createSecurity();
		case ReqPackage.OPERATION_EVENT:
			return createOperation_event();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface_req createInterface_req() {
		Interface_reqImpl interface_req = new Interface_reqImpl();
		return interface_req;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Functional_req createFunctional_req() {
		Functional_reqImpl functional_req = new Functional_reqImpl();
		return functional_req;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRS createSRS() {
		SRSImpl srs = new SRSImpl();
		return srs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Realize createRealize() {
		RealizeImpl realize = new RealizeImpl();
		return realize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constrain createConstrain() {
		ConstrainImpl constrain = new ConstrainImpl();
		return constrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Depend createDepend() {
		DependImpl depend = new DependImpl();
		return depend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composite createComposite() {
		CompositeImpl composite = new CompositeImpl();
		return composite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interact createInteract() {
		InteractImpl interact = new InteractImpl();
		return interact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restriction createRestriction() {
		RestrictionImpl restriction = new RestrictionImpl();
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input_output createInput_output() {
		Input_outputImpl input_output = new Input_outputImpl();
		return input_output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance createPerformance() {
		PerformanceImpl performance = new PerformanceImpl();
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliability createReliability() {
		ReliabilityImpl reliability = new ReliabilityImpl();
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation_event createOperation_event() {
		Operation_eventImpl operation_event = new Operation_eventImpl();
		return operation_event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqPackage getReqPackage() {
		return (ReqPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReqPackage getPackage() {
		return ReqPackage.eINSTANCE;
	}

} //ReqFactoryImpl
