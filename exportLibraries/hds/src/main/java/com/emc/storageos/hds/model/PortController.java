/*
 * Copyright 2015 EMC Corporation
 * All Rights Reserved
 */
/**
 *  Copyright (c) 2013 EMC Corporation
 * All Rights Reserved
 *
 * This software contains the intellectual property of EMC Corporation
 * or is licensed to EMC Corporation from third parties.  Use of this
 * software and the intellectual property contained therein is expressly
 * limited to the terms and conditions of the License Agreement under which
 * it is provided by or on behalf of EMC.
 */
package com.emc.storageos.hds.model;

public class PortController {

    private String objectID;
    private String displayName;
    private String controllerID;
    private String cluster;
    /**
     * @return the objectID
     */
    public String getObjectID() {
        return objectID;
    }
    /**
     * @param objectID the objectID to set
     */
    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }
    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    /**
     * @return the controllerID
     */
    public String getControllerID() {
        return controllerID;
    }
    /**
     * @param controllerID the controllerID to set
     */
    public void setControllerID(String controllerID) {
        this.controllerID = controllerID;
    }
    /**
     * @return the cluster
     */
    public String getCluster() {
        return cluster;
    }
    /**
     * @param cluster the cluster to set
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
}
