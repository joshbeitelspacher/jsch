/* -*-mode:java; c-basic-offset:2; -*- */
/* JSch
 * Copyright (C) 2002 ymnk, JCraft,Inc.
 *  
 * Written by: 2002 ymnk<ymnk@jcaft.com>
 *   
 *   
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Library General Public License
 * as published by the Free Software Foundation; either version 2 of
 * the License, or (at your option) any later version.
   
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Library General Public License for more details.
 * 
 * You should have received a copy of the GNU Library General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

package com.jcraft.jsch.jce;

import com.jcraft.jsch.HASH;

import java.security.*;

public class SHA1 implements HASH{
  MessageDigest md;
  public int getBlockSize(){return 20;}
  public void init() throws Exception{
    try{ md=MessageDigest.getInstance("SHA-1"); }
    catch(Exception e){
      System.out.println(e);
    }
  }
  public void update(byte[] foo, int start, int len) throws Exception{
    md.update(foo, start, len);
  }
  public byte[] digest() throws Exception{
    return md.digest();
  }
}
