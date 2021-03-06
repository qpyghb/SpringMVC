import com.bean.AdminInfo;
import com.dao.IAdminInfoDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class AdminInfoDaoTest {

    @Autowired
    private IAdminInfoDAO IAdminInfoDAO;

    @Test
    public void name() {
        int id = 1;
        AdminInfo adminInfo = IAdminInfoDAO.findAdminInfoById(id);
        System.out.println(adminInfo.getId() + " : " + adminInfo.getName());
    }
}
