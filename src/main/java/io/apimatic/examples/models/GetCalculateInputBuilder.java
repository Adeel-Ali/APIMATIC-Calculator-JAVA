/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/23/2016
 */
package io.apimatic.examples.models;

import java.util.*;

public class GetCalculateInputBuilder {
    //the instance to build
    private GetCalculateInput getCalculateInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetCalculateInputBuilder() {
        getCalculateInput = new GetCalculateInput();
    }

    /**
     * The operator to apply on the variables
     */
    public GetCalculateInputBuilder operation(OperationTypeEnum operation) {
        getCalculateInput.setOperation(operation);
        return this;
    }

    /**
     * The LHS value
     */
    public GetCalculateInputBuilder x(double x) {
        getCalculateInput.setX(x);
        return this;
    }

    /**
     * The RHS value
     */
    public GetCalculateInputBuilder y(double y) {
        getCalculateInput.setY(y);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCalculateInput build() {
        return getCalculateInput;
    }
}