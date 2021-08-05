// SPDX-FileCopyrightText: 2021 Alliander N.V.
//
// SPDX-License-Identifier: Apache-2.0

package org.lfenergy.compas.cim.mapping.rest.v1.model;

import org.lfenergy.compas.cim.mapping.model.CimData;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

import static org.lfenergy.compas.cim.mapping.CimMappingConstants.CIM_MAPPING_SERVICE_V1_NS_URI;

@XmlRootElement(name = "MapRequest", namespace = CIM_MAPPING_SERVICE_V1_NS_URI)
@XmlAccessorType(XmlAccessType.FIELD)
public class MapRequest {
    @Valid
    @XmlElement(name = "CimData", namespace = CIM_MAPPING_SERVICE_V1_NS_URI)
    private List<CimData> cimData;

    public List<CimData> getCimData() {
        return cimData;
    }

    public void setCimData(List<CimData> cimData) {
        this.cimData = cimData;
    }
}
