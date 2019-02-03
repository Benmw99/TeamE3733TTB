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
    @Before
    public void init(){
        Form one = new Form();
    }

}
