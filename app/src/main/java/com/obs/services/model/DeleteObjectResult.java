package com.obs.services.model;

/**
 * 删除对象的响应结果
 */
public class DeleteObjectResult extends HeaderResponse
{
    private boolean deleteMarker;
    
    private String versionId;
    
    
    public DeleteObjectResult(boolean deleteMarker, String versionId) {
		this.deleteMarker = deleteMarker;
		this.versionId = versionId;
	}

	/**
     * 判断多版本对象是否已被删除
     * @return 对象是否被删除标识
     */
	public boolean isDeleteMarker() {
		return deleteMarker;
	}

	/**
	 * 获取被删除对象的版本号
	 * @return 对象的版本号
	 */
	public String getVersionId() {
		return versionId;
	}


	@Override
	public String toString() {
		return "DeleteObjectResult [deleteMarker=" + deleteMarker + ", versionId=" + versionId + "]";
	}
    
}
