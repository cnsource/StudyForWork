<template>
  <div class="container">
    <h1>User</h1>
    <table class="table table-hover">
      <thead class="thead-dark">
      <tr>
        <th scope="col">ID</th>
        <th scope="col">姓名</th>
        <th scope="col">性别</th>
        <th scope="col">年龄</th>
        <th scope="col">电话</th>
        <th scope="col">生日</th>
        <th scope="col">操作</th>
      </tr>
      </thead>
      <tbody>
      <tr v-for="user in users">
        <th scope="row" v-text="user.id">1</th>
        <td v-text="user.name">Mark</td>
        <td v-text="user.sex">Otto</td>
        <td v-text="user.age">@mdo</td>
        <td v-text="user.phone">Mark</td>
        <td v-text="user.birth">Otto</td>
        <td>
          <button @click="deluser(user.id)" class="btn btn-danger">删除</button>
          <button @click="findone(user.id)" class="btn btn-primary">修改</button>
        </td>
      </tr>
      </tbody>
    </table>
    <hr>
    <div class="mb-3 col-lg-4 col-md-12" >
      <h3>姓名：</h3>
      <input type="text" class="form-control" placeholder="Username" v-model="user.name" aria-label="Username"
             aria-describedby="basic-addon1">
      <br>
      <h3>性别：</h3>
      <input type="text" class="form-control" placeholder="Age" v-model="user.sex" aria-label="Username"
             aria-describedby="basic-addon1">
      <br>
      <h3>年龄：</h3>
      <input type="number" class="form-control" placeholder="Age" v-model="user.age" aria-label="Username"
             aria-describedby="basic-addon1">
      <br>
      <h3>出生日期：</h3>
      <input type="text" class="form-control" placeholder="Birth" v-model="user.birth"
             aria-label="Username"
             aria-describedby="basic-addon1">
      <br>
      <h3>电话：</h3>
      <input type="text" class="form-control" placeholder="Phone" v-model="user.phone"
             aria-label="Username"
             aria-describedby="basic-addon1">
      <br>
      <div>
        <button type="button" class="btn btn-danger" @click="reset">重置</button>&emsp;&emsp;
        <button type="button" class="btn btn-primary" @click="saveUserInfo">提交</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "User",
  data() {
    return {
      users:{},
      user:{}
    }
  },
  methods:{
    deluser(id){
      this.$http.delete("http://localhost:8088/user/"+id).then(res=>{
        console.log(res.data);
        this.users = res.data.users
        if (res.data.success){
          this.findall()
        }
      }).catch(e=>{
        console.log(e);
      })
    },
    findone(id){
      this.$http.get("http://localhost:8088/user/"+id).then(res=>{
        console.log(res.data);
        this.user = res.data
      }).catch(e=>{
        console.log(e);
      })
    },
    findall(){
      this.$http.get("http://localhost:8088/user/1/10").then(res=>{
        console.log(res.data);
        this.users = res.data.users
      }).catch(e=>{
        console.log(e);
      })
    },

    saveUserInfo() {
      if(this.user.id != undefined){
        this.updateUser();
      }else if (Object.keys(this.user).length>0) {
        this.saveUser();
      }else {
        alert("未填写用户数据")
      }
    },
    saveUser(){
      this.$http.post("http://localhost:8088/user", this.user).then(resp => {
        console.log(this.user);
        console.log(resp.data);
        this.findall();
        this.user = {}
      }).catch(e => console.log("保存用户请求出错了" + e))
    },
    updateUser(){
      this.$http.put("http://localhost:8088/user", this.user).then(resp => {
        console.log(this.user);
        console.log(resp.data);
        this.findall();
        this.user = {}
      }).catch(e => console.log("保存用户请求出错了" + e))
    },
    reset() {
      this.user = {}
    }
  },
  created(){
    console.log("created...执行了")
    this.findall();
  }
}
</script>

<style scoped>

</style>
