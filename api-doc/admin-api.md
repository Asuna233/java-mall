# API接口文档


**简介**:API接口文档


**HOST**:http://localhost:8501


**联系人**:atguigu


**Version**:1.0


**接口路径**:/v3/api-docs/admin-api


[TOC]






# sys-user-controller


## updateSysUser


**接口地址**:`/admin/system/sysUser/updateSysUser`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "userName": "",
  "password": "",
  "name": "",
  "phone": "",
  "avatar": "",
  "description": "",
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysUser|系统用户实体类|body|true|SysUser|SysUser|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;userName|用户名||false|string||
|&emsp;&emsp;password|密码||false|string||
|&emsp;&emsp;name|昵称||false|string||
|&emsp;&emsp;phone|手机号码||false|string||
|&emsp;&emsp;avatar|图像||false|string||
|&emsp;&emsp;description|描述||false|string||
|&emsp;&emsp;status|状态（1：正常 0：停用）||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## saveSysUser


**接口地址**:`/admin/system/sysUser/saveSysUser`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "userName": "",
  "password": "",
  "name": "",
  "phone": "",
  "avatar": "",
  "description": "",
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysUser|系统用户实体类|body|true|SysUser|SysUser|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;userName|用户名||false|string||
|&emsp;&emsp;password|密码||false|string||
|&emsp;&emsp;name|昵称||false|string||
|&emsp;&emsp;phone|手机号码||false|string||
|&emsp;&emsp;avatar|图像||false|string||
|&emsp;&emsp;description|描述||false|string||
|&emsp;&emsp;status|状态（1：正常 0：停用）||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## doAssign


**接口地址**:`/admin/system/sysUser/doAssign`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "userId": 0,
  "roleIdList": []
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|assginRoleDto|请求参数实体类|body|true|AssginRoleDto|AssginRoleDto|
|&emsp;&emsp;userId|用户id||false|integer(int64)||
|&emsp;&emsp;roleIdList|角色id的List集合||false|array|integer(int64)|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## fingByPage


**接口地址**:`/admin/system/sysUser/findByPage/{pageNum}/{pageSize}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum||path|true|integer(int32)||
|pageSize||path|true|integer(int32)||
|sysUserDto|请求参数实体类|query|true|SysUserDto|SysUserDto|
|&emsp;&emsp;keyword|搜索关键字||false|string||
|&emsp;&emsp;createTimeBegin|开始时间||false|string||
|&emsp;&emsp;createTimeEnd|结束时间||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## deleteById


**接口地址**:`/admin/system/sysUser/deleteById/{userId}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# sys-role-controller


## updateSysRole


**接口地址**:`/admin/system/sysRole/updateSysRole`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "roleName": "",
  "roleCode": "",
  "description": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysRole|角色实体类|body|true|SysRole|SysRole|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;roleName|角色名称||false|string||
|&emsp;&emsp;roleCode|角色编码||false|string||
|&emsp;&emsp;description|描述||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## saveSysRole


**接口地址**:`/admin/system/sysRole/saveSysRole`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "roleName": "",
  "roleCode": "",
  "description": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysRole|角色实体类|body|true|SysRole|SysRole|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;roleName|角色名称||false|string||
|&emsp;&emsp;roleCode|角色编码||false|string||
|&emsp;&emsp;description|描述||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findByPage


**接口地址**:`/admin/system/sysRole/findByPage/{current}/{limit}`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "roleName": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|current||path|true|integer(int32)||
|limit||path|true|integer(int32)||
|sysRoleDto|请求参数实体类|body|true|SysRoleDto|SysRoleDto|
|&emsp;&emsp;roleName|角色名称||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findAllRoles


**接口地址**:`/admin/system/sysRole/findAllRoles/{userId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## deleteById_1


**接口地址**:`/admin/system/sysRole/deleteById/{roleId}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|roleId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# sys-menu-controller


## update


**接口地址**:`/admin/system/sysMenu/update`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "parentId": 0,
  "title": "",
  "component": "",
  "sortValue": 0,
  "status": 0,
  "children": [
    {
      "id": 0,
      "createTime": "",
      "updateTime": "",
      "isDeleted": 0,
      "parentId": 0,
      "title": "",
      "component": "",
      "sortValue": 0,
      "status": 0,
      "children": []
    }
  ]
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysMenu|系统菜单实体类|body|true|SysMenu|SysMenu|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;parentId|父节点id||false|integer(int64)||
|&emsp;&emsp;title|节点标题||false|string||
|&emsp;&emsp;component|组件名称||false|string||
|&emsp;&emsp;sortValue|排序值||false|integer(int32)||
|&emsp;&emsp;status|状态(0:禁止,1:正常)||false|integer(int32)||
|&emsp;&emsp;children|子节点||false|array|SysMenu|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## save


**接口地址**:`/admin/system/sysMenu/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "parentId": 0,
  "title": "",
  "component": "",
  "sortValue": 0,
  "status": 0,
  "children": [
    {
      "id": 0,
      "createTime": "",
      "updateTime": "",
      "isDeleted": 0,
      "parentId": 0,
      "title": "",
      "component": "",
      "sortValue": 0,
      "status": 0,
      "children": []
    }
  ]
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysMenu|系统菜单实体类|body|true|SysMenu|SysMenu|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;parentId|父节点id||false|integer(int64)||
|&emsp;&emsp;title|节点标题||false|string||
|&emsp;&emsp;component|组件名称||false|string||
|&emsp;&emsp;sortValue|排序值||false|integer(int32)||
|&emsp;&emsp;status|状态(0:禁止,1:正常)||false|integer(int32)||
|&emsp;&emsp;children|子节点||false|array|SysMenu|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findNodes


**接口地址**:`/admin/system/sysMenu/findNodes`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## removeById


**接口地址**:`/admin/system/sysMenu/removeById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# product-spec-controller


## updateById


**接口地址**:`/admin/product/productSpec/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "specName": "",
  "specValue": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|productSpec|商品规格实体类|body|true|ProductSpec|ProductSpec|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;specName|规格名称||false|string||
|&emsp;&emsp;specValue|规格值||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## save_1


**接口地址**:`/admin/product/productSpec/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "specName": "",
  "specValue": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|productSpec|商品规格实体类|body|true|ProductSpec|ProductSpec|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;specName|规格名称||false|string||
|&emsp;&emsp;specValue|规格值||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findByPage_1


**接口地址**:`/admin/product/productSpec/{page}/{limit}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page||path|true|integer(int32)||
|limit||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultPageInfoProductSpec|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||PageInfoProductSpec|PageInfoProductSpec|
|&emsp;&emsp;total||integer(int64)||
|&emsp;&emsp;list|商品规格实体类|array|ProductSpec|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;specName|规格名称|string||
|&emsp;&emsp;&emsp;&emsp;specValue|规格值|string||
|&emsp;&emsp;pageNum||integer(int32)||
|&emsp;&emsp;pageSize||integer(int32)||
|&emsp;&emsp;size||integer(int32)||
|&emsp;&emsp;startRow||integer(int64)||
|&emsp;&emsp;endRow||integer(int64)||
|&emsp;&emsp;pages||integer(int32)||
|&emsp;&emsp;prePage||integer(int32)||
|&emsp;&emsp;nextPage||integer(int32)||
|&emsp;&emsp;isFirstPage||boolean||
|&emsp;&emsp;isLastPage||boolean||
|&emsp;&emsp;hasPreviousPage||boolean||
|&emsp;&emsp;hasNextPage||boolean||
|&emsp;&emsp;navigatePages||integer(int32)||
|&emsp;&emsp;navigatepageNums||array|integer(int32)|
|&emsp;&emsp;navigateFirstPage||integer(int32)||
|&emsp;&emsp;navigateLastPage||integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"total": 0,
		"list": [
			{
				"id": 0,
				"createTime": "",
				"updateTime": "",
				"isDeleted": 0,
				"specName": "",
				"specValue": ""
			}
		],
		"pageNum": 0,
		"pageSize": 0,
		"size": 0,
		"startRow": 0,
		"endRow": 0,
		"pages": 0,
		"prePage": 0,
		"nextPage": 0,
		"isFirstPage": true,
		"isLastPage": true,
		"hasPreviousPage": true,
		"hasNextPage": true,
		"navigatePages": 0,
		"navigatepageNums": [],
		"navigateFirstPage": 0,
		"navigateLastPage": 0
	}
}
```


## findAll_1


**接口地址**:`/admin/product/productSpec/findAll`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## deleteById_2


**接口地址**:`/admin/product/productSpec/deleteById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# product-controller


## updateById_1


**接口地址**:`/admin/product/product/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "name": "",
  "brandId": 0,
  "category1Id": 0,
  "category2Id": 0,
  "category3Id": 0,
  "unitName": "",
  "sliderUrls": "",
  "specValue": "",
  "status": 0,
  "auditStatus": 0,
  "auditMessage": "",
  "brandName": "",
  "category1Name": "",
  "category2Name": "",
  "category3Name": "",
  "productSkuList": [
    {
      "id": 0,
      "createTime": "",
      "updateTime": "",
      "isDeleted": 0,
      "skuCode": "",
      "skuName": "",
      "productId": 0,
      "thumbImg": "",
      "salePrice": 0,
      "marketPrice": 0,
      "costPrice": 0,
      "stockNum": 0,
      "saleNum": 0,
      "skuSpec": "",
      "weight": "",
      "volume": "",
      "status": 0
    }
  ],
  "detailsImageUrls": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|product|商品实体类|body|true|Product|Product|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;name|商品名称||false|string||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;category1Id|一级分类id||false|integer(int64)||
|&emsp;&emsp;category2Id|二级分类id||false|integer(int64)||
|&emsp;&emsp;category3Id|三级分类id||false|integer(int64)||
|&emsp;&emsp;unitName|计量单位||false|string||
|&emsp;&emsp;sliderUrls|轮播图url||false|string||
|&emsp;&emsp;specValue|商品规格值json串||false|string||
|&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架||false|integer(int32)||
|&emsp;&emsp;auditStatus|审核状态||false|integer(int32)||
|&emsp;&emsp;auditMessage|审核信息||false|string||
|&emsp;&emsp;brandName|品牌名称||false|string||
|&emsp;&emsp;category1Name|一级分类名称||false|string||
|&emsp;&emsp;category2Name|二级分类名称||false|string||
|&emsp;&emsp;category3Name|三级分类名称||false|string||
|&emsp;&emsp;productSkuList|ProductSku||false|array|ProductSku|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识||false|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间||false|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间||false|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuCode|商品编号||false|string||
|&emsp;&emsp;&emsp;&emsp;skuName|skuName||false|string||
|&emsp;&emsp;&emsp;&emsp;productId|商品ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;thumbImg|缩略图路径||false|string||
|&emsp;&emsp;&emsp;&emsp;salePrice|售价||false|number||
|&emsp;&emsp;&emsp;&emsp;marketPrice|市场价||false|number||
|&emsp;&emsp;&emsp;&emsp;costPrice|成本价||false|number||
|&emsp;&emsp;&emsp;&emsp;stockNum|库存数||false|integer||
|&emsp;&emsp;&emsp;&emsp;saleNum|销量||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuSpec|sku规格信息json||false|string||
|&emsp;&emsp;&emsp;&emsp;weight|重量||false|string||
|&emsp;&emsp;&emsp;&emsp;volume|体积||false|string||
|&emsp;&emsp;&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架||false|integer||
|&emsp;&emsp;detailsImageUrls|图片详情列表||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## save_2


**接口地址**:`/admin/product/product/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "name": "",
  "brandId": 0,
  "category1Id": 0,
  "category2Id": 0,
  "category3Id": 0,
  "unitName": "",
  "sliderUrls": "",
  "specValue": "",
  "status": 0,
  "auditStatus": 0,
  "auditMessage": "",
  "brandName": "",
  "category1Name": "",
  "category2Name": "",
  "category3Name": "",
  "productSkuList": [
    {
      "id": 0,
      "createTime": "",
      "updateTime": "",
      "isDeleted": 0,
      "skuCode": "",
      "skuName": "",
      "productId": 0,
      "thumbImg": "",
      "salePrice": 0,
      "marketPrice": 0,
      "costPrice": 0,
      "stockNum": 0,
      "saleNum": 0,
      "skuSpec": "",
      "weight": "",
      "volume": "",
      "status": 0
    }
  ],
  "detailsImageUrls": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|product|商品实体类|body|true|Product|Product|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;name|商品名称||false|string||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;category1Id|一级分类id||false|integer(int64)||
|&emsp;&emsp;category2Id|二级分类id||false|integer(int64)||
|&emsp;&emsp;category3Id|三级分类id||false|integer(int64)||
|&emsp;&emsp;unitName|计量单位||false|string||
|&emsp;&emsp;sliderUrls|轮播图url||false|string||
|&emsp;&emsp;specValue|商品规格值json串||false|string||
|&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架||false|integer(int32)||
|&emsp;&emsp;auditStatus|审核状态||false|integer(int32)||
|&emsp;&emsp;auditMessage|审核信息||false|string||
|&emsp;&emsp;brandName|品牌名称||false|string||
|&emsp;&emsp;category1Name|一级分类名称||false|string||
|&emsp;&emsp;category2Name|二级分类名称||false|string||
|&emsp;&emsp;category3Name|三级分类名称||false|string||
|&emsp;&emsp;productSkuList|ProductSku||false|array|ProductSku|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识||false|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间||false|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间||false|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuCode|商品编号||false|string||
|&emsp;&emsp;&emsp;&emsp;skuName|skuName||false|string||
|&emsp;&emsp;&emsp;&emsp;productId|商品ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;thumbImg|缩略图路径||false|string||
|&emsp;&emsp;&emsp;&emsp;salePrice|售价||false|number||
|&emsp;&emsp;&emsp;&emsp;marketPrice|市场价||false|number||
|&emsp;&emsp;&emsp;&emsp;costPrice|成本价||false|number||
|&emsp;&emsp;&emsp;&emsp;stockNum|库存数||false|integer||
|&emsp;&emsp;&emsp;&emsp;saleNum|销量||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuSpec|sku规格信息json||false|string||
|&emsp;&emsp;&emsp;&emsp;weight|重量||false|string||
|&emsp;&emsp;&emsp;&emsp;volume|体积||false|string||
|&emsp;&emsp;&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架||false|integer||
|&emsp;&emsp;detailsImageUrls|图片详情列表||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## list


**接口地址**:`/admin/product/product/{page}/{limit}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page||path|true|integer(int32)||
|limit||path|true|integer(int32)||
|productDto|商品搜索条件实体类|query|true|ProductDto|ProductDto|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;category1Id|一级分类id||false|integer(int64)||
|&emsp;&emsp;category2Id|二级分类id||false|integer(int64)||
|&emsp;&emsp;category3Id|三级分类id||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## updateStatus


**接口地址**:`/admin/product/product/updateStatus/{id}/{status}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||
|status||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## updateAuditStatus


**接口地址**:`/admin/product/product/updateAuditStatus/{id}/{auditStatus}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||
|auditStatus||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## getById


**接口地址**:`/admin/product/product/getById/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## deleteById_3


**接口地址**:`/admin/product/product/deleteById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# category-brand-controller


## updateById_2


**接口地址**:`/admin/product/categoryBrand/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "brandId": 0,
  "categoryId": 0,
  "categoryName": "",
  "brandName": "",
  "logo": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryBrand|分类品牌实体类|body|true|CategoryBrand|CategoryBrand|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||
|&emsp;&emsp;categoryName|分类名称||false|string||
|&emsp;&emsp;brandName|品牌名称||false|string||
|&emsp;&emsp;logo|品牌logo||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## save_3


**接口地址**:`/admin/product/categoryBrand/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "brandId": 0,
  "categoryId": 0,
  "categoryName": "",
  "brandName": "",
  "logo": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryBrand|分类品牌实体类|body|true|CategoryBrand|CategoryBrand|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||
|&emsp;&emsp;categoryName|分类名称||false|string||
|&emsp;&emsp;brandName|品牌名称||false|string||
|&emsp;&emsp;logo|品牌logo||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findByPage_2


**接口地址**:`/admin/product/categoryBrand/{page}/{limit}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page||path|true|integer(int32)||
|limit||path|true|integer(int32)||
|categoryBrandDto|搜索条件实体类|query|true|CategoryBrandDto|CategoryBrandDto|
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findBrandByCategoryId


**接口地址**:`/admin/product/categoryBrand/findBrandByCategoryId/{categoryId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## deleteById_4


**接口地址**:`/admin/product/categoryBrand/deleteById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# brand-controller


## updateById_3


**接口地址**:`/admin/product/brand/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "name": "",
  "logo": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brand|品牌实体类|body|true|Brand|Brand|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;name|品牌名称||false|string||
|&emsp;&emsp;logo|品牌logo||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## save_4


**接口地址**:`/admin/product/brand/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "name": "",
  "logo": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brand|品牌实体类|body|true|Brand|Brand|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;name|品牌名称||false|string||
|&emsp;&emsp;logo|品牌logo||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## list_1


**接口地址**:`/admin/product/brand/{page}/{limit}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page||path|true|integer(int32)||
|limit||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findAll_2


**接口地址**:`/admin/product/brand/findAll`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## deleteById_5


**接口地址**:`/admin/product/brand/deleteById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# sys-role-menu-controller


## doAssign_1


**接口地址**:`/admin/system/sysRoleMenu/doAssign`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "roleId": 0,
  "menuIdList": []
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|assginMenuDto|请求参数实体类|body|true|AssginMenuDto|AssginMenuDto|
|&emsp;&emsp;roleId|角色id||false|integer(int64)||
|&emsp;&emsp;menuIdList|选中的菜单id的集合||false|array|object|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findSysRoleMenuByRoleId


**接口地址**:`/admin/system/sysRoleMenu/findSysRoleMenuByRoleId/{roleId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|roleId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# index-controller


## login


**接口地址**:`/admin/system/index/login`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "userName": "",
  "password": "",
  "captcha": "",
  "codeKey": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|loginDto|用户登录请求参数|body|true|LoginDto|LoginDto|
|&emsp;&emsp;userName|用户名||false|string||
|&emsp;&emsp;password|密码||false|string||
|&emsp;&emsp;captcha|提交验证码||false|string||
|&emsp;&emsp;codeKey|验证码key||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## menus


**接口地址**:`/admin/system/index/menus`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## logout


**接口地址**:`/admin/system/index/logout`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|token||header|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## getUserInfo


**接口地址**:`/admin/system/index/getUserInfo`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## generateValidateCode


**接口地址**:`/admin/system/index/generateValidateCode`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultValidateCodeVo|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||ValidateCodeVo|ValidateCodeVo|
|&emsp;&emsp;codeKey|验证码key|string||
|&emsp;&emsp;codeValue|验证码value|string||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"codeKey": "",
		"codeValue": ""
	}
}
```


# file-upload-controller


## fileUpload


**接口地址**:`/admin/system/fileUpload`


**请求方式**:`POST`


**请求数据类型**:`multipart/form-data`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|file||query|true|file||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# category-controller


## importData


**接口地址**:`/admin/product/category/importData`


**请求方式**:`POST`


**请求数据类型**:`multipart/form-data`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|file||query|true|file||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## findCategoryList


**接口地址**:`/admin/product/category/findCategoryList/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## exportData


**接口地址**:`/admin/product/category/exportData`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# product-unit-controller


## findAll


**接口地址**:`/admin/product/productUnit/findAll`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# order-info-controller


## getOrderStatisticsData


**接口地址**:`/admin/order/orderInfo/getOrderStatisticsData`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|orderStatisticsDto|搜索条件实体类|query|true|OrderStatisticsDto|OrderStatisticsDto|
|&emsp;&emsp;createTimeBegin|开始时间||false|string||
|&emsp;&emsp;createTimeEnd|结束时间||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultOrderStatisticsVo|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||OrderStatisticsVo|OrderStatisticsVo|
|&emsp;&emsp;dateList|日期数据集合|array|string|
|&emsp;&emsp;amountList|总金额数据集合|array|number|


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"dateList": [],
		"amountList": []
	}
}
```