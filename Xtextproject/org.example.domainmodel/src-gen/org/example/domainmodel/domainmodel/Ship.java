/**
 * generated by Xtext 2.25.0
 */
package org.example.domainmodel.domainmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.domainmodel.domainmodel.Ship#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Ship#getAction <em>Action</em>}</li>
 *   <li>{@link org.example.domainmodel.domainmodel.Ship#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getShip()
 * @model
 * @generated
 */
public interface Ship extends Declaration
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.Condition}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getShip_Conditions()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditions();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getShip_Action()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getAction();

  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference list.
   * The list contents are of type {@link org.example.domainmodel.domainmodel.Address}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference list.
   * @see org.example.domainmodel.domainmodel.DomainmodelPackage#getShip_Address()
   * @model containment="true"
   * @generated
   */
  EList<Address> getAddress();

} // Ship
