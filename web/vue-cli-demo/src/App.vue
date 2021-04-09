<template>
  <div id="app">
    <div style="text-align: center;margin-top: 30px">
      <router-link to="/home"   class="btn">Home</router-link>
      &emsp;&emsp;
      <router-link to="/users"  class="btn">User</router-link>
      &emsp;&emsp;
      <router-link to="/student" class="btn">Student</router-link>
    </div>
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>

</style>
