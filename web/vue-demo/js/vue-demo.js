const app = new Vue({
    el: '#app',
    data: {
        users: [],
        user: {}
    },
    methods: {
        saveUserInfo() {
            axios.post("http://localhost:8085/vue/user/save", this.user).then(resp => {
                console.log(this.user);
                console.log(resp.data);
                this.findAll();
                this.user = {}
            }).catch(e => console.log("保存用户请求出错了" + e))
        },
        dele(uid) {
            axios.delete("http://localhost:8085/vue/user/delete/" + uid).then(resp => {
                console.log(resp.data);
                this.findAll();
            }).catch(e => console.log(e))
        },
        update(uid) {
            axios.get("http://localhost:8085/vue/user/one?id=" + uid).then(resp => {
                console.log(resp.data);
                this.user = resp.data
            }).catch(e => console.log("获取用户出错了" + e))
        },
        findAll() {
            axios.get("http://localhost:8085/vue/user/all").then(resp => {
                console.log(resp.data);
                this.users = resp.data
            }).catch(e => console.log("获取用户列表出错了" + e))
        },
        reset() {
            this.user = {}
        },
    },
    created() {
        this.findAll();
    }
})
var serchbar = new Vue({
    el: "#serchbar",
    data: {
        user: {}
    },
    methods: {
        serch() {
            axios.get("http://localhost:8085/vue/user/serch?name="+this.user.name+"&phone="+this.user.phone).then(resp => {
                console.log(resp.data);
                app.users = resp.data
            }).catch(e => console.log("查询用户出错了" + e))
        },
    }
})