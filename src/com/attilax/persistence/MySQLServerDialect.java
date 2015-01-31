package com.attilax.persistence;
import org.hibernate.dialect.MySQL5Dialect;
import org.hibernate.dialect.SQLServerDialect;
import java .sql.Types;
import org.hibernate.Hibernate;

/**
 * com.attilax.persistence.MySQLServerDialect
 * @author ASIMO
 *
 */
public class MySQLServerDialect extends MySQL5Dialect
{
 public MySQLServerDialect()
 {
      super();
      registerHibernateType(Types.LONGVARCHAR, Hibernate.TEXT.getName());
 }
}