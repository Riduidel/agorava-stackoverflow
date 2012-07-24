/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.Infos;

/**
 * Interface providing access to global site infos
 * @author Nicolas
 */
public interface StackExchangeInfoService extends StackExchangeURIs {
    Infos getInfos();
}
