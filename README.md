# StudyForWork
学习笔记及项目
vue-demo:
	遇到的问题
		01： 跨域访问
			@CrossOrigin 可以在方法和类上使用，默认支持get、post、head、请求
		使用restful 风格的api时，@DeleteMapping、@PutMapping等方法无法跨域
		
	解决方案：
		在@CrossOrigin 上配置具体支持的跨域方法
			[RequestMethod.POST,
			 RequestMethod.DELETE,
			 RequestMethod.PUT,
			 RequestMethod.GET]

