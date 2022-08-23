// This file can be replaced during build by using the `fileReplacements` array.
// `ng build` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.

export const environment = {
  production: false,
 // loginURL:"http://localhost:8765/auth/login",
 //loginURL:"http://localhost:9090/auth/login",

 loginURL:'http://nikshitha-lb-934390085.us-east-1.elb.amazonaws.com/auth/login',
 sentReturnOrderURL:"http://nikshitha-lb-934390085.us-east-1.elb.amazonaws.com/return-component/createReturnRequest",
 confirmReturn:"http://nikshitha-lb-934390085.us-east-1.elb.amazonaws.com/return-component/confirmReturn/"
 
  //sentReturnOrderURL:"http://localhost:8081/return-component/createReturnRequest",
  // confirmReturn:"http://localhost:8081/return-component/confirmReturn/"
};

/*
 * For easier debugging in development mode, you can import the following file
 * to ignore zone related error stack frames such as `zone.run`, `zoneDelegate.invokeTask`.
 *
 * This import should be commented out in production mode because it will have a negative impact
 * on performance if an error is thrown.
 */
// import 'zone.js/plugins/zone-error';  // Included with Angular CLI.
