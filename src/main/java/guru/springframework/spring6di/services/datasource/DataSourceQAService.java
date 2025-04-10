package guru.springframework.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class DataSourceQAService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Quality Assurance";
    }
}
