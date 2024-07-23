v.getWoodcutting().chop(40758);
    v.getCallbacks().afterTicks(1, () -> {
            v.invoke("Use", "<col=ff9040>Mahogany logs",0,25,8,9764864, false);
    v.invoke("Use", "<col=ffff>Mahogany logs</col><col=ffffff> -> <col=ff9040>Knife</col>",0,58,4,9764864,false);
     v.getInventory().drop(6333);
});