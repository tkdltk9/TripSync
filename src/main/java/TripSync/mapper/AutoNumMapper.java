package TripSync.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AutoNumMapper {
	String AutoNumSelect(@Param("sep")String sep
			, @Param("len") Integer len
			, @Param("col") String col
			, @Param("table")String table);
}
