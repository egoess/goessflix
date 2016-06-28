/**
 * UPCSearchCallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package net.apoplectic.goessflix.service;


/**
 *  UPCSearchCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class UPCSearchCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public UPCSearchCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public UPCSearchCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getProductJSON method
     * override this method for handling normal response from getProductJSON operation
     */
    public void receiveResultgetProductJSON(
            net.apoplectic.goessflix.service.UPCSearchStub.GetProductJSONResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProductJSON operation
     */
    public void receiveErrorgetProductJSON(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for generateBarcode method
     * override this method for handling normal response from generateBarcode operation
     */
    public void receiveResultgenerateBarcode(
            net.apoplectic.goessflix.service.UPCSearchStub.GenerateBarcodeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from generateBarcode operation
     */
    public void receiveErrorgenerateBarcode(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for convertToUPCA method
     * override this method for handling normal response from convertToUPCA operation
     */
    public void receiveResultconvertToUPCA(
            net.apoplectic.goessflix.service.UPCSearchStub.ConvertToUPCAResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from convertToUPCA operation
     */
    public void receiveErrorconvertToUPCA(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProduct method
     * override this method for handling normal response from getProduct operation
     */
    public void receiveResultgetProduct(
            net.apoplectic.goessflix.service.UPCSearchStub.GetProductResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProduct operation
     */
    public void receiveErrorgetProduct(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for validate method
     * override this method for handling normal response from validate operation
     */
    public void receiveResultvalidate(
            net.apoplectic.goessflix.service.UPCSearchStub.ValidateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from validate operation
     */
    public void receiveErrorvalidate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for suggestProduct method
     * override this method for handling normal response from suggestProduct operation
     */
    public void receiveResultsuggestProduct(
            net.apoplectic.goessflix.service.UPCSearchStub.SuggestProductResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from suggestProduct operation
     */
    public void receiveErrorsuggestProduct(java.lang.Exception e) {
    }
}
