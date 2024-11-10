const base = {
    get() {
        return {
            url : "http://localhost:8080/banshidatingzhengwuyue/",
            name: "banshidatingzhengwuyue",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/banshidatingzhengwuyue/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "办事大厅政务预约系统"
        } 
    }
}
export default base
