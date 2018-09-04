/**
 * 
 */
package com.dongnaoedu.mybatis.handlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import com.dongnaoedu.vo.Location;

/**
 * 自定义handler
 * 
 * @author 动脑学院.Tony老师
 * @see 专注在职IT人员能力提升，咨询顾问QQ: 2048209527
 */
@MappedTypes({ Location.class })
@MappedJdbcTypes(JdbcType.VARCHAR)
public class LocationHandler implements TypeHandler<Location> {

    @Override
    public void setParameter(PreparedStatement ps, int i, Location parameter, JdbcType jdbcType)
            throws SQLException {
        // point(1 2) 对象转字符串
        ps.setString(i, parameter.toString());
    }

    @Override
    public Location getResult(ResultSet rs, String columnName) throws SQLException {
        String columnValue = rs.getString(columnName);
        System.out.println("3数据库查询结果:" + columnValue);
        // point(1 2) 字符串转对象
        return new Location().parse(columnValue);
    }

    @Override
    public Location getResult(ResultSet rs, int columnIndex) throws SQLException {
        String columnValue = rs.getString(columnIndex);
        // point(1 2) 字符串转对象
        System.out.println("2数据库查询结果:" + columnValue);

        return new Location().parse(columnValue);
    }

    @Override
    public Location getResult(CallableStatement cs, int columnIndex) throws SQLException {
        String columnValue = cs.getResultSet().getString(columnIndex);
        System.out.println("1数据库查询结果:" + columnValue);
        // point(1 2) 字符串转对象
        return new Location().parse(columnValue);
    }

}
