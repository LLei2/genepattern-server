/**
 *
 *  edtFTPj
 *
 *  Copyright (C) 2000  Enterprise Distributed Technologies Ltd
 *
 *  www.enterprisedt.com
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  Bug fixes, suggestions and comments should be should posted on 
 *  http://www.enterprisedt.com/forums/index.php
 *
 *  Change Log:
 *
 *        $Log: TestReconnect.java,v $
 *        Revision 1.2  2008-06-03 05:52:39  bruceb
 *        reconnect changes
 *
 *        Revision 1.1  2008-05-22 04:21:14  bruceb
 *        small tweaks
 *
 *        Revision 1.4  2005/07/15 17:30:06  bruceb
 *        rework of unit testing structure
 *
 *        Revision 1.3  2005/06/03 11:27:05  bruceb
 *        comment update
 *
 *        Revision 1.2  2004/09/18 14:28:23  bruceb
 *        rename test method
 *
 *        Revision 1.1  2004/08/31 10:44:17  bruceb
 *        test code
 *
 *
 */

package com.enterprisedt.net.ftp.test;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 *  Test quit() & reconnect
 *
 *  @author         Bruce Blackshaw
 *  @version        $Revision: 1.2 $
 */
public class TestReconnect extends FTPTestCase {

    /**
     *  Revision control id
     */
    public static String cvsId = "@(#)$Id: TestReconnect.java,v 1.2 2008-06-03 05:52:39 bruceb Exp $";

    /**
     *  Get name of log file
     *
     *  @return name of file to log to
     */
    protected String getLogName() {
        return "TestReconnect.log";
    }

    /**
     *  Test reconnecting
     */
    public void testReconnect() throws Exception {
        
        connect();

        ftp.pwd();
        
        // complete
        ftp.quit();
        
        reconnect(ftp);
        
        ftp.pwd();
        
        ftp.quit();
    }

    /**
     *  Automatic test suite construction
     *
     *  @return  suite of tests for this class
     */
    public static Test suite() {
        return new TestSuite(TestReconnect.class);
    }

    /**
     *  Enable our class to be run, doing the
     *  tests
     */
    public static void main(String[] args) {       
        junit.textui.TestRunner.run(suite());
    } 

}

