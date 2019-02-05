package DB.Test;

import DB.Database;
import Entities.*;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.sql.*;
import static org.junit.Assert.*;

public class EntityToDBTest {
    Database db = Database.getInstance();
    Form one;
    int ID_ONE;
    @Before
    public void init()
    {
        db.tableBuilder.resetDB();
        one = new Form(AlcoholType.DistilledLiquor,
                "BUDDY", (float) 5.6);
        one.setPhoneNumber("6035026034");
        one.setEmail("Jim@jimmail.com");
        Manufacturer man = new Manufacturer("sysadmin@swollenjams.com", "PASS");
        man.setManID(123);
        try {
            db.dbInsert.insertCompany(123, "Buddweiser", "User", "Pass");
            ID_ONE = db.dbInsert.insertForm(one, man);
            one.setTtbID(ID_ONE);
        } catch (SQLException e){
            System.out.println(e.toString());
        }
    }

    @Test
    public void getFormTest(){
        Form same = db.dbSelect.getFormByTTB_ID(ID_ONE);
        assertEquals(one.getEmail(), same.getEmail());
        assertEquals(one.getFancifulName(), same.getFancifulName());
        assertEquals(one.getRepID(), same.getRepID());
        assertEquals(one.getBrandName(), same.getBrandName());
    }
    @Test
    public void approvalTest(){
        Approval approve = new Approval();
        approve.approve("Jimmy", "NONE");
        one.setApproval(approve);
        one.setApprovalStatus(ApprovalStatus.Complete);
        db.dbSelect.approveForm(one, one.getApproval());
        Form app = db.dbSelect.getFormByTTB_ID(one.getTtbID());
        assertEquals("Jimmy", app.getApproval().getAgentApprovalName());
        assertEquals(one.getApproval().getTimestamp(), app.getApproval().getTimestamp());
        assertEquals(one.getApproval().getExpDate(), app.getApproval().getExpDate());
        assertEquals(one.getApprovalStatus(), app.getApprovalStatus());
    }

}
