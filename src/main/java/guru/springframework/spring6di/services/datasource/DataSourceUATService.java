package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class DataSourceUATService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "User Acceptance Testing";
    }
}
