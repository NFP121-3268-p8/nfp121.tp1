package question3;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class Test3.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test3
{
    /**
     * Default constructor for test class Test3
     */
    public Test3()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void Test3()
    {
    }

    @Test
    public void Test1()
    {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("youhanna", "saade", "pg1234");
        question3.AuditeurCNAM auditeur2 = new question3.AuditeurCNAM("toni", "saad", "1234");
        question3.AuditeurCNAM auditeur3 = new question3.AuditeurCNAM("mano", "saadeh", "p1234");
    }

    @Test
    public void mano()
    {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("Jhon", "johnny", "pg123");
    }
    @Test
    public void adam()
    {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("maro", "bitar", "pg1235");
       
}
}




