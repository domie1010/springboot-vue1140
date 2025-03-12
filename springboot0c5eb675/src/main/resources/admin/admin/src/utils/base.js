const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0c5eb675/",
            name: "springboot0c5eb675",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0c5eb675/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于推荐算法的智能书店的设计与实现"
        } 
    }
}
export default base
