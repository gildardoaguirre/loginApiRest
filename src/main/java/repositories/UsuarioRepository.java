package repositories;
import java.util.function.LongBinaryOperator;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import models.*;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,VarcharJdbcType>{
    
}
