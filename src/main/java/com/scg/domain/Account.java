/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scg.domain;

import java.io.Serializable;

/**
 * Interface all accounts must implement.
 * @author dixya
 */
public interface Account extends Serializable{
    String getName();
    boolean isBillable();
}
    
    
