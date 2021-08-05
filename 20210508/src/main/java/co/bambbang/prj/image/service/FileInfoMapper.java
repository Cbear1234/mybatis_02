package co.bambbang.prj.image.service;

import java.util.List;

import co.bambbang.prj.image.vo.FileInformationVO;

public interface FileInfoMapper {
	List<FileInformationVO> fileSelectList();
	FileInformationVO fileSelect(int key);
	int fileInsert(FileInformationVO vo);
	int fileUpdate(FileInformationVO vo);
	int fileDelete(int key);
	
}
